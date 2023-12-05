// function displaycode()
// {
//     var random=Math.floor(Math.random()*1000000)
//     div2.body.style.backgroun=`#${random}`
// }
// var az=document.querySelector("displaycode")
// az.addEventListener("click", displaycode)

// function generaterandom()
// {
//     var random=Math.floor(Math.random()*1000000)
//     return `#${random}`
// }

// function displaycode()
// {
//     var div2=document.querySelector("#div2")
//     var h2=document.querySelector("h2")
//     var randomValue=generaterandom()
//     div2.Style.background=randomValue
//     h2.innerText=randomValue
// }  
var inp=document.querySelector("#inp")
var btn=document.querySelector("#btn")
var aside=document.querySelector("aside")
btn.addEventListener("click",()=>{
    var ans=parserInt(inp.value);
    for(let i=0;i<ans;i++)
    {
        var div1=document.createElement("div")
        var h2=document.querySelector("h2")
        var generated=generate()
        h2.innerText="hello"
        
        div1.style.height="100px"
        div1.style.width="100px"
        div1.style.background=generated j 
        aside.appendChild(div1)
    }
    // console.log(ans)
})
function generate()
{
    var ans=Math.floor(Math.random()*10000)
    return `#${ans}`

}
console.log(generate())