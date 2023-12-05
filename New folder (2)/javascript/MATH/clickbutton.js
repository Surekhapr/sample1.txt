console.log("hello js")
function test()
{
    console.log("iam a click");
}
var btn=document.querySelector("button")
btn.addEventListener("click",test)

function test2()
{
    var v1=document.querySelector("#div1")
    var v2=document.querySelector("#div2")
    v1.style.backgroundColor="blue"
    v2.style.backgroundColor ="green"
}

