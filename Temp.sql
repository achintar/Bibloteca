
--Number1.))

SELECT member.name
	FROM member, checkout_item, book
	WHERE
	member.id = checkout_item.member_id AND book.id = checkout_item.book_id AND book.title = 'The Hobbit';

SELECT book.title
	FROM member, checkout_item, book
	WHERE
	member.id = checkout_item.member_id AND book.id = checkout_item.book_id AND member.name = 'Achinta Roy';

--ANS: Anand Beck




--Number2.))

SELECT COUNT(member.id) FROM member
    WHERE member.id NOT IN (
    SELECT member_id FROM checkout_item);


    select count(*)
    from member left join checkout_item on member.id = checkout_item.member_id where checkout_item.member_id IS NULL;

--    ANS: 37




--Number3.))


select book.title,movie.title
    from book left join checkout_item on book.id = checkout_item.book_id where checkout_item.book_id IS NULL AND
    from movie left join checkout_item on movie.id = checkout_item.movie_id where checkout_item.movie_id IS NULL;

select book.title from book left join checkout_item on book.id = checkout_item.book_id where checkout_item.book_id IS NULL
union
select movie.title from movie left join checkout_item on movie.id = checkout_item.movie_id where checkout_item.movie_id IS NULL;


--Ans. Thin Red Line
--	Crouching Tiger, Hidden Dragon
--	Lawrence of Arabia
--	Office Space
--  Fellowship of the Ring
--  1984
--  Tom Sawyer
--  Catcher in the Rye
--  To Kill a Mockingbird
--  Domain Driven Design


--Number4.))

INSERT INTO book VALUES (11, ‘The Pragmatic Programmer’);
INSERT INTO member VALUES (43, ‘Achinta Roy’);
INSERT INTO checkout_item VALUES (43, 11, NULL);


--Number5.))


SELECT member.name FROM member WHERE member.id IN (
        SELECT member_id FROM checkout_item GROUP BY member_id HAVING COUNT(member_id) > 1);

--Ans.Anand Beck
--Frank Smith