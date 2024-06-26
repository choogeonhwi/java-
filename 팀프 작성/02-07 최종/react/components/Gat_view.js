import React, { useState, useEffect } from 'react';
import { useSearchParams } from "react-router-dom";
import Navi from './Navi';
import Button from "react-bootstrap/Button";
import { Input } from 'reactstrap';
import $ from 'jquery';
import axios from "axios";
import AOS from "aos";
import '../css/gat_view.css';

function formatDate(rawDate) {
  const date = new Date(rawDate);
  const options = { year: 'numeric', month: '2-digit', day: '2-digit'};
  return date.toLocaleDateString('ko-KR', options);
}
function formatDateTime(rawDate) {
  const date = new Date(rawDate);
  const options = { year: 'numeric', month: '2-digit', day: '2-digit', hour: '2-digit', minute: '2-digit'};
  return date.toLocaleString('ko-KR', options);
}

const Meeting = () => {
  useEffect(() => {
      AOS.init({ duration: 2000 });
  });
  
  const handleSwitchClick1 = () => {
    $(".mswitchBtn1").css("visibility", "hidden");
    $(".mswitchBtn2").css("visibility", "visible");
    
    $(".mlist_details5").css("visibility", "hidden");
    $(".mlist_details6").css("visibility", "visible");
  };
  const handleSwitchClick2 = () => {
    $(".mswitchBtn1").css("visibility", "visible");
    $(".mswitchBtn2").css("visibility", "hidden");
    
    $(".mlist_details5").css("visibility", "visible");
    $(".mlist_details6").css("visibility", "hidden");
  };
  
  const [searchParams, setSearchParams] = useSearchParams();
  const [newComment, setNewComment] = useState("");
  const [isEditing, setIsEditing] = useState(false);
  const [editedTitle, setEditedTitle] = useState("");
  const [editedContent, setEditedContent] = useState("");
  const [isAlreadyJoined, setIsAlreadyJoined] = useState(false);
  const [qMem, setQMem] = useState([]);
  const [loginMem, setLoginMem] = useState('');
  const [members, setMembers] = useState([]);
  const [isMember, setIsMember] = useState(false);
  const [plans, setPlans] = useState([]);
  const [chats, setChats] = useState([]);
  const id = searchParams.get("id");

  // 세션 요청 함수 -- ok
  const getSession = async () => {
    try {
      await axios.post("/api/getSession")
      .then(res => {
        setLoginMem(res.data);
      });
    } catch (error) {
      console.error(error);
    }
  }

  // 모임 정보 요청 함수 -- ok
  const getGat = async () => {
    try {
      await axios.post("/api/gatInfo", {id:id})
      .then(response => {
        setQMem(response.data);
        console.log(response.data);
        $(".mlist_details3").text(response.data.gat_title);
        $(".mlist_details4").text(response.data.gat_desc);
        $(".mlist_details_id").text(response.data.member_mem_nname);
        $(".mlist_details_date").text(response.data.gat_date);
        $(".mli_box3 img").attr("src", `/images/gathering/${response.data.gat_img_name1}.${response.data.gat_img_ext}`);
      });

    } catch (error) {
      console.error('Error fetching data:', error);
      alert("오류가 발생했습니다.");
    }
  }

  // 모임 멤버 요청 함수 -- ok
  const getMembers = async () => {
    try {
      await axios.post("/api/gatMems", {id:id})
      .then(response => {
        let tf = false;
        setMembers(response.data);
        console.log(response.data);
        for (let i = 0; i < response.data.length; i++) {
          $(".gv_memberList").append(`<li>${response.data[i].member_MEM_NNAME}</li>`);
          if (loginMem == response.data[i].member_MEM_ID) {
            setIsMember(true);
            tf = true;
          }
        }
        // 비회원이거나 모임회원이 아닌 경우
        if (!tf) {
          $("#gv_joinBt").css("display", "none");
          $("#gv_planAddBt").css("display", "none");
          $("#gv_chatBt").attr("disabled", true);
          $("#gv_modiBt").css("display", "none");
          $("#gv_delBt").css("display", "none");
        }
      });
    } catch (error) {
      console.error(error);
    }
  }
  
  // 모임 계획 요청 함수 --- ok
  const getPlans = async () => {
    try {
      await axios.post("/api/gatPlans", {id:id})
      .then(response => {
        setPlans(response.data);
        console.log(response.data);
        for (let i = 0; i < response.data.length; i++) {
          $(".gv_planList").append(`<li><a href='#'>${response.data[i].gat_PLAN_TITLE}</a></li>`)
        }
      });
    } catch (error) {
      console.error(error);
    }
  }

  // 모임 채팅 요청 함수 --- ok
  const getChats = async () => {
    try {
      await axios.post("/api/gatChats", {id:id})
      .then(response => {
        setChats(response.data);
        console.log(response.data);
        for (let i = 0; i < response.data.length; i++) {
          $(".gv_chatList").append(`<li>${response.data[i].member_MEM_NNAME} : ${response.data[i].gat_CHAT_DESC}</li>`)
        }
      });
    } catch (error) {
      console.error(error);
    }
  }

  // 모임 참여하기 함수 -- ok
  const handleJoinClick = async () => {
    try {
      await axios.post("/api/joinGat", {
        gat_id: id,  // 모임 ID
        mem_id: loginMem, // 멤버 ID
      })
      .then(res => {
        if (res.data === 1) {
          alert("모임에 참여했습니다 !");
          window.location.href = `/gat_view?id=${id}`;
        } else {
          alert("모임 참여에 실패했습니다 !");
        }
      });
    } catch (error) {
      console.error('Error joining meeting:', error);
      alert('참여 중 오류가 발생했습니다.');
    }
  };

  // ---------------------------------------------------------------------------------------------------------------------
  // ---------------------------------------------------------------------------------------------------------------------
  // ---------------------------------------------------------------------------------------------------------------------

  //수정
  const handleEditClick = () => {
    $(".mchangeBtn").css("visibility", "visible");
    setIsEditing(true);
    setEditedTitle(qMem.title);
    setEditedContent(qMem.content);
  };
  //(수정)저장
  const handleSaveClick = async  () => {
    const data = {
      id:id,
      title:$(".mtitle_modify").val(),
      content:$(".mcontent_modify").val(),
    }
    try {
      // 수정된 제목과 내용을 서버에 전송
        await axios.post("/api/updateMem", data);
      
      // 성공적으로 저장되면 편집 모드를 비활성화하고 수정된 내용을 다시 불러옴
      setIsEditing(false);
      // setQMem({
      //   title: $(".title_modify").val(),
      //   content: $(".content_modify").val(),
      // });
      getGat();
      $(".mchangeBtn").css("visibility", "hidden");
    } catch (error) {
      console.error('Error updating data:', error);
      alert('수정 중 오류가 발생했습니다.');
    }
  };

  // 삭제 처리
  const handleDeleteClick = async () => {
    try {
      // 서버에 삭제 요청을 보냄
      await axios.delete("/api/deleteMem", {
        data: {id}
      });
  
      // 삭제가 성공하면 현재 보여지고 있는 내용을 지움
      setQMem({
        id: '',
        date: '',
        title: '',
        content: '',
        comments: '',
        member: ''
      });
      window.location.href = "#";
      // history.push("#");
    } catch (error) {
      console.error('Error deleting data:', error);
      alert('삭제 중 오류가 발생했습니다.');
    }
  };

  const handleCommentSubmit = async () => {
    if (newComment.trim() === "") {
      alert("내용을 입력하세요.");
    } else {
      try {
        // 댓글 데이터 서버에 전송
        await axios.post("/api/addComment", {
          id: id,
          comments: newComment,
          date: new Date().toISOString(),
        });

        // 댓글 입력 필드 초기화
        setNewComment("");
        // 댓글 목록 다시 불러오기
        getGat();
      } catch (error) {
        console.error('Error adding comment:', error);
        alert('댓글 달기 중 오류가 발생했습니다.');
      }
    }
  };

  useEffect(() => {
    getSession();
    getGat();
    getMembers();
    getPlans();
    getChats();
  }, [id]);

  useEffect(() => {
    if (qMem && qMem.member) {
      // qMem.member 배열에 현재 id가 이미 포함되어 있는지 확인
      const isAlreadyJoined = qMem.member.includes(id);
      setIsAlreadyJoined(isAlreadyJoined);
    }
  }, [qMem, id]);

  return (
    <div><Navi />
      <div className='mlist_details1' data-aos="fade-right">
        <table className="mlist_details2">
          <tbody>
            <tr>
              <td className='mli_box1'>모임장</td>
              <td className='mlist_details_id'></td>
              <td className='mli_box2'>생성일</td>
              <td className='mlist_details_date'></td>
              <td className='mli_box3'>
                <img src='../images/login_logo.png' alt="login_logo"></img>
              </td>
            </tr>
            <tr>
              <td className='mli_box4'>모 임 명 </td>
            </tr>
            <tr>
              <td className='mli_box5'>모 임 소 개      및               안 내 사 항 </td>
            </tr>

            <Button className='mswitchBtn1' onClick={handleSwitchClick1}>멤버 보기</Button>
            <Button className='mswitchBtn2' onClick={handleSwitchClick2}>일정 보기</Button>
            <Button className='mchangeBtn' onClick={handleSaveClick}>
            {isEditing ? '저장' : '목록보기'}
          </Button>
            {!isEditing && (
            <>
            <tr className='mBtn'>
            <Button href='#' className='mBtn1' id='gv_joinBt' onClick={handleJoinClick}>참여하기</Button>
            <Button href='#' className='mBtn2' onClick={() => window.location.href = "/gat_home"}>목록보기</Button>
            <Button className='mBtn3' onClick={handleEditClick} id='gv_modiBt'>수정</Button>
            <Button className='mBtn4' onClick={handleDeleteClick} id='gv_delBt'>삭제</Button>
            </tr>
            </>
            )}
            
          </tbody>
        </table>
          {isEditing ? (
            <input className='mtitle_modify' type="text" value={editedTitle} onChange={(e) => setEditedTitle(e.target.value)} />
            ) : (
            <div className='mlist_details3'></div>
            )}
          {isEditing ? (
          <input className='mcontent_modify' value={editedContent} onChange={(e) => setEditedContent(e.target.value)}/>
          ) : (
          <div className='mlist_details4'></div>
          )}
          <div className='mlist_details5'>
            <ul className='gv_planList'>
              {/* <li><a href='#'>{qMem.schedule}</a></li> */}
            </ul>
            <a href='#' className='schedule' id='gv_planAddBt'>일정 생성</a>
          </div>
          <div className='mlist_details6'>
            <ul className='gv_memberList'>
                
            </ul>
          </div>
          <div className='mlist_details7'>
            <div className='mlist_details8'>
              <ul className='gv_chatList'>
                {/* <li>남의 댓글</li> */}
                {/* 댓글 목록 출력 */}
                {qMem.commentsList && qMem.commentsList.length > 0 && (
                <li>
                  {qMem.commentsList.map((comment, index) => (
                    <li key={index} className='comment.isMyComment'>
                    {/* <li key={index} className={comment.isMyComment ? 'mycomments' : 'othercomments'}> */}
                      {comment.comments}
                      <span style={{ fontSize: '13px' }}> ({comment.id}, {formatDateTime(comment.date)})</span>
                    </li>
                    ))}
                </li>
                )}
              </ul>
            </div>
            <Input value={newComment} onChange={(e) => setNewComment(e.target.value)} />
            <Button onClick={handleCommentSubmit} id='gv_chatBt'>댓글 달기</Button>
          </div>
      </div>
    </div>
  );
};

  export default Meeting;