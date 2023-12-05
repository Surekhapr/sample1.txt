var name1=document.querySelector("#name1")
var email=document.querySelector("#email1")
var pass=document.querySelector("#pass")
var cpass=document.querySelector("#cpass")
var num=document.querySelector("#num1")

console.log(String.fromCharCode(48));
console.log(String.fromCharCode(57));

var str="surekha121";
let assumption=false;
for(let i=0;i<str.length;i++)
{
    if(str.charCodeAt(i)>=48 && str.charCodeAt(i)<=57)
    {
        assumption=true
        break
    }
}
if(assumption==false)
{
    console.log("string is valid")
}
else
{
    console.log("string is invalid")
}

// function evalu()
// {
//     var count=0;
//     for(int i=0;i<str.length;i++)
//     {
//         if(str[i]>=0||str[i]<=9)
//         {
//             count++;
//         }

//     }
//     if(count>0)
//     {
//         console.log("sting is invalid")
//     }
//     else{
//         console.log("string is valid")
//     }
// }
// evalu()
