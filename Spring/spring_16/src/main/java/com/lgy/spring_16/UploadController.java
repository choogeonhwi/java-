package com.lgy.spring_16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.lgy.spring_16.domain.AttachFileDTO;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;

@Controller
@Slf4j
public class UploadController {
	//uploadForm 뷰를 찾아감
	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("uploadForm~!!!");
	}
	
//	uploadFormAction.jsp를 찾아감
	@PostMapping("/uploadFormAction")
	public void uploadFormPost(MultipartFile[] uploadFile) {
		String uploadFolder ="D:\\dev\\upload";
		
		for (MultipartFile multipartFile : uploadFile) {
			log.info("==========================");
//			getOriginalFilename : 업로드 되는 파일 이름
			log.info("@# 업로드 되는 파일 이름 ===>"+multipartFile.getOriginalFilename());
//			getSize : 업로드 되는 파일 크기
			log.info("@# 업로드 되는 파일 크기 ===>"+multipartFile.getSize());
			
//			saveFile : 경로하고 파일이름
			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
			try {
//				transferTo : saveFile 내용을 저장
				multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@GetMapping("/uploadJquery")
	public void uploadJquery() {
		log.info("uploadJquery~!!!");
	}
	
//	POST http://localhost:8181/spring_16/uploadAjaxAction 404 (Not Found)
	@PostMapping("/uploadAjaxAction")
//	public void uploadAjaxPost(MultipartFile[] uploadFile) {
//	ResponseEntity : 파일 정보를 넘기기위해서 사용
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("@# uploadAjaxPost");

		List<AttachFileDTO> list=new ArrayList<AttachFileDTO>();
		
		String uploadFolder ="D:\\dev\\upload";
		String uploadFolderPath =  getFolder();
//		"D:\\dev\\upload"+년월일 폴더
		File uploadPath = new File(uploadFolder, uploadFolderPath);
		log.info("@# uploadPath===>"+uploadPath);
		
		if (uploadPath.exists() == false) {
			// make yyyy/MM/dd folder
			uploadPath.mkdirs();
		}
		
		for (MultipartFile multipartFile : uploadFile) {
			log.info("==========================");
//			getOriginalFilename : 업로드 되는 파일 이름
			log.info("@# 업로드 되는 파일 이름 ===>"+multipartFile.getOriginalFilename());
//			getSize : 업로드 되는 파일 크기
			log.info("@# 업로드 되는 파일 크기 ===>"+multipartFile.getSize());
			
			String uploadFileName = multipartFile.getOriginalFilename();
			
			UUID uuid = UUID.randomUUID();
			log.info("@# uuid===>"+uuid);
			
			AttachFileDTO attachFileDTO = new AttachFileDTO();
			attachFileDTO.setFileName(uploadFileName);
			attachFileDTO.setUuid(uuid.toString());
			attachFileDTO.setUploadPath(uploadFolderPath);
			log.info("@# attachFileDTO 01===>"+attachFileDTO);
			
			uploadFileName = uuid+"_"+uploadFileName;
			
//			saveFile : 경로하고 파일이름
//			File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
//			File saveFile = new File(uploadPath, multipartFile.getOriginalFilename());
			File saveFile = new File(uploadPath, uploadFileName);
			try {
//				transferTo : saveFile 내용을 저장
				multipartFile.transferTo(saveFile);
				
//				참이면 이미지 파일
				if (checkImageType(saveFile)) {
					attachFileDTO.setImage(true);
					log.info("@# attachFileDTO 02===>"+attachFileDTO);
					
//					썸네일 파일은 s_ 를 앞에 추가
					FileOutputStream thumnail = new FileOutputStream(new File(uploadPath,"s_"+uploadFileName));
//					썸네일 파일 형식을 100/100 크기로 생성
					Thumbnailator.createThumbnail(multipartFile.getInputStream(),thumnail,100,100);
					thumnail.close();
				}
				list.add(attachFileDTO);
			} catch (Exception e) {
				e.printStackTrace();
			}//end of catch
		}//end of for
//		파일정보들을 list 객체에 담고, http 상태값은 정상으로 리턴
		return new ResponseEntity<List<AttachFileDTO>>(list, HttpStatus.OK);
	}
	
//	날짜별 폴더 생성
	private String getFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		
		log.info("@# str===>"+str);
		log.info("@# separator===>"+File.separator);
		
		return str.replace("-", File.separator);
	}
	
//	이미지 여부 체크
	public boolean checkImageType(File file) {
		try {
//			이미지파일인지 체크하기 위한 타입(probeContentType)
			String contentType = Files.probeContentType(file.toPath());
			log.info("@# contentType===>"+contentType);
			log.info("@# startsWith===>"+contentType.startsWith("image"));
			
			// probeContentType 메소드 버그로 로직 추가
			if (contentType == null) {
				return false;
			}
			
			
//			startsWith : 파일종류 판단
			return contentType.startsWith("image");//참이면 이미지파일
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;//거짓이면 이미지파일이 아님
	}
}














