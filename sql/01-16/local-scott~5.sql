select bid,bname,btitle,bcontent,bdate,bhit
from(select rownum rn,bid,bname,btitle,bcontent,bdate,bhit 
from mvc_board
where rownum <= (2* 10)
order by bid desc)
where rn > (2-1)*10


select bid,bname,btitle,bcontent,bdate,bhit
from(select rownum rn, bid,bname,btitle,bcontent,bdate,bhit 
from mvc_board
where rownum <= (#{pageNum}*#{amount})
order by bid desc)
where rn > (#{pageNum}-1)*#{amount}