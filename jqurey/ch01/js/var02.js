//1. 자바스크립트는 자료형이 동적으로 정해진다.
//무적권 오른쪽에서 왼쪽으로 진행 10을 만드고 해석하고 num에 집어넣는다.

var num=10;//정수 //1byte //4byte->heap 
console.log("num",num);

var str="문자열";//문자열 //9byte //4byte->heap
console.log("str",str);

var floatNum=10.5;//실수 //8yte //4byte->heap
console.log("floatNum",floatNum);

var charStr="가";//문자//3byte(아스키라면 1byte) //4byte->heap
console.log("charStr",charStr);

var boolData =true;//참거짓, true, false //1byte //4byte->heap
console.log("boolData",boolData);

var list=[1,2,3,4,5,6]; //4byte->heap 배열
console.log("list",list);
console.log("list[0]",list[0]);
console.log("list[5]",list[5]);

//자바스크립트 오브젝트(key: value) 4byte->heap
var user = {
    name: "홍길동",
    phone: "0102222"
}
console.log("user",user);
console.log("user.name",user.name);
console.log("user.phone",user.phone);


var hello = function(){  //4byte->heap
    alert("함수 호출됨");
} 

hello();