var clik=document.querySelector("#clik")
clik.addEventListener("click",()=>{
    console.log("iam a click")
})

function givecolr()
{
    var div1=document.querySelector("#div1")
    var div2=document.querySelector("#div2")
    div1.style.background="red"
    div2.style.background="green"
}

function generaterandom()
{
    var random=Math.floor(Math.random()*1000000);
    document.body.style.background=`#${random}`
}

// document.querySelector("randombtn").addEventListener("click",generaterandom)

var rand=document.querySelector("#randombtn")
rand.addEventListener("click",generaterandom)