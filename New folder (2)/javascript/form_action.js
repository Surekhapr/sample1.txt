var name1=document.querySelector("#name1")
var num1=document.querySelector("#num1")
var email1=document.querySelector("#email1")
var pass1=document.querySelector("#pass1")
var cpass1=document.querySelector("#cpass1")
var sub1=document.querySelector("#submit1")

sub1.addEventListener("click",()=>{
    var namevalue=name1.value;
    var emailvalue=email1.value;
    var numvalue=num1.value;
    var passvalue=pass1.value;
    var cpassvalue=cpass1.value;
    console.log(namevalue)
    console.log(numvalue)


})
let assumption=true
for(let i=0;i<name1.length;i++)
{
    if(name1.includes(i))
    {
        assumption=false
        break
    }

}
if(assumption==true)
{
    console.log("it s valid")
}
else{
    {
        console.log("it s not valid")
    }
}