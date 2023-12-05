function test()
{
    console.log("iam clicked")
}
var btn=document.querySelector("button")
btn.addEventListener("click",test)

function test2()
{
    var d1=document.querySelector("#div1")
    var d2=document.querySelector("#div2")
    d1.style.background="yellow"
    d2.style.background="green"

}

function test3()
{
   var random=Math.floor(Math.random()*10000)
   document.body.style.background=`#${random}`
}
//test3()
document.querySelector("#ra")

