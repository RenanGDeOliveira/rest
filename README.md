# rest

README:

1º Download, export into eclipse/netbeans
2º Run as Maven Build... 
3º Update Maven Project
4º Add the war's project into tom cat server 7.0
5º Our BD were created using MySQL:

Create table SQL

/**/

create table user (
	id int not null auto_increment,
	name varchar(255),
  description varchar(255),
  primary key(id)
);

/**/

TESTS:

We'll use the postman ( https://www.getpostman.com/ or https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop , a Google Chrome Extension ) to test our program:

1º Test our get method

URL : http://localhost:8081/restcrud/users


2º Post method

 Post method is used to create new user:
 
URL : http://localhost:8081/restcrud/addUsers
 
 
3º Put Method

 Put method is used to update user:
 
URL : http://localhost:8081/restcrud/users
 
 
4º  Delete method is used to delete a user:
 
URL : http://localhost:8081/restcrud/users/1 -> this'll delete the user with ID #1
 
 
 
