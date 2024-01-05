<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
// 		확장자가 exe|sh|js 업로드 금지하기 위한 정규식
			var regex = new RegExp("(.*?)\.(exe|sh|js)$");
			var maxSize = 5242880;//5MB
			
// 		업로드할 파일이 들어있는 formdata안에 모든 키를 삭제하는 메소드 선언(초기화를 위해)
			function clearFormData(formData) {
			    // 모든 키를 순회하면서 삭제
			    for (var key of formData.keys()) {
			        formData.delete(key);
			    }
			}
			
			function checkExtension(fileName, fileSize) {
				if (fileSize > maxSize) {
					alert("파일 사이즈 초과");
					return false;
				}
				if (regex.test(fileName)) {
					alert("해당 종류의 파일은 업로드할 수 없습니다.");
					return false;
				}
				return true;
			}
			
			var formData = new FormData();
			
			var cloneObj = $(".uploadDiv").clone();
			console.log("@# cloneObj===>"+cloneObj);
			
			$("#uploadBtn").on("click",function(){
				var inputFile = $("input[name='uploadFile']");
// 			files : 파일정보
				var files = inputFile[0].files;
				console.log("@# files===>"+files);
				console.log("@# files[0]===>"+files[0].name);
// 				console.log("@# files[1]===>"+files[1].name);
				
				for (var i = 0; i < files.length; i++) {
// 				파일크기와 종류중에서 거짓이면 리턴
					if (!checkExtension(files[i].name, files[i].size)) {
						return;
					}
					
// 				파일 정보를 formData에 추가
					formData.append("uploadFile",files[i]);
				}
				
				$.ajax({
// 				컨트롤러단 호출
// 					url:"uploadAjaxAction"
// 				result 로 파일 목록을 보내기 위해서 json 방식 사용
					url:"uploadAjaxAction.json"
//	 					processData : 기본은 key/value 를 Query String 으로 전송하는게 true
//	 					(파일 업로드는 false)
					,processData: false
//	 				   contentType : 기본값 : "application / x-www-form-urlencoded; charset = UTF-8"
//	 				   첨부파일은 false : multipart/form-data로 전송됨
					,contentType: false
					,data:formData
					,type:"post"
					,success:function(result){
						alert("Uploaded");
						console.log(result);
						
//	 					파일정보들을 함수로 보냄
						showUploadedFile(result);
						
//	 					파일 업로드 전 초기상태로 설정(화면)
						$(".uploadDiv").html(cloneObj.html());
//		 				업로드후, formData를 비우기위해 선언해놓은 초기화 메소드 실행
						clearFormData(formData);
					}
				});//end of ajax
			});//end of click function
			
			var uploadResult = $(".uploadResult ul");
			
// 		업로드 파일 목록 처리
			function showUploadedFile(uploadResultArr) {
				console.log("@# uploadResultArr===>"+uploadResultArr);
				var str="";
				
// 				업로드 파일 갯수만큼 반복
				$(uploadResultArr).each(function(i,obj) {
// 				obj.fileName : 업로드파일 이름
					str += "<li>"+obj.fileName+"</li>";
				});//end of each function
// 			div class 에 파일 목록 추가
				uploadResult.append(str);
			}
		});//end of ready function
	</script>
</head>
<body>
	<h1>Upload with Jquery</h1>
	
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	
	<div class="uploadResult">
		<ul>
		</ul>
	</div>
	
	<button id="uploadBtn">Upload</button>
</body>
</html>












