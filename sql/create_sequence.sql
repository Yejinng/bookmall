-- sequences



-- book_seq
drop sequence book_seq;
create sequence book_seq
start with 1
increment by 1
maxvalue 999999999;

-- category_seq
drop sequence category_seq;

create sequence category_seq
start with 1
increment by 1
maxvalue 999999999;

-- member_seq
drop sequence member_seq;

create sequence member_seq
start with 1
increment by 1
maxvalue 999999999;

-- orders_seq
drop sequence orders_seq;

create sequence orders_seq
start with 1
increment by 1
maxvalue 999999999;

select o.no, m.name || ' ' || m.email, o.price, o.address from orders o, member m where o.no2 = m.no order by no asc;
select m.no, b.title, c.order_no, b.price from member m, book b, cart c where m.no = c.no and c.no2 = b.no order by no asc;
select b.no, b.title, b.price, b.category_no, c.name from book b, category c where b.category_no=c.no order by no asc;