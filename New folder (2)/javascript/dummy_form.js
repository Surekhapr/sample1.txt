var name1=document.querySelector("#name1")
var email1=document.querySelector("#email1")
var num1=document.querySelector("#num1")

var pass1=document.querySelector("#pass1")
var cpass1=document.querySelector("#cpass1")
var reset1=document.querySelector("#reset")
var submit=document.querySelector("#submit")

submit.addEventListener("click",()=>{
    var nameValue=name1.Value;
    var email1Value=email1.Value;
    var numValue=num1.Value;
    var passValue=pass1.Value;
    var cpassValue=cpass1.Value;
    var email1Value=email1.Value;

    console.log(nameValue)
    console.log(numValue)

})

let assumption=true;
for(let i=0;i<name1.clientHeight;i++)
{
    if(name1.includes(i))
    {
        assumption=false
        break;
    }
}
if(assumption==true)
{

console.log("is a valid")
}
else{
    console.log("is invalid")
}

function testemail()
{
    var email1="abc@gmail.com"
    if(email1.includes("@" && email.includes(".com")))
    {
        return true
    }
    else{
        return false
    }
}
console.log(testemail)

// console.log(String.fromCharCode(48))
// console.log(String.fromCharCode(57))
// var str="surekha0987"
// let assumption=false
// for(let i=0;i<str.length;i++)
// {
//     if(str.charCodeAt(i)>=48 && str.charCodeAt(i)<=57)
//     {
//         assumption=true
//         break
//     }
// }
// if(assumption==false) 
// {
//     console.log("string is invalid")
// }
// else
// {
    
//     console.log("string is valid")

// }

// function evaluate()
// {
//     var count=0;
//     for(let i=0;i<str.length;i++)
//     {
//         if(str[i]>=0|| str[i]<=9)
//         {
//             count++;
//         }
//     }
//     if(count>0)
//     {
//         console.log("string is invalid")
//     }
//     else
//     {
//         console.log("string is valid")
//     }

// }
// evaluate()

