var inp=document.querySelector("input")
var btn=document.querySelector("button")
var aside=document.querySelector("aside")
btn.addEventListener("click",()=>{
    var ans=parseInt(inp.value)
    for(let i=0;i<=ans;i++)
    {
        var div1=document.createElement("div")
        var h2=document.createElement("h2")
        var generated=generate()
        h2.innerText=div1.style.height="100px"
        div1.style.width="100px"
        div1.style.background=generated
        aside.appendChild(div1)
    }
})
function generate()
{
    var ans=Math.floor(Math.random()*1000000)
    return `#${ans}`
}
