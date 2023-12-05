// var btn1=document.querySelector("#btn")
// btn1.addEventListener("click",()=>{
//     console.log("iam a clcik")
// })

// function givecolr(){{
//     var div1=document.querySelector("#div1")
//     var div2=document.querySelector("#div2")
//     div1.style.backgroundColor="red"
//     div2.style.backgroundColor="green"
// }}

// function randombtn()
// {
//     var randomValue1=generaterandom()
//     document.body.style.background=randomValue1

// }

// function displaycode()
// {
//     var div2=document.querySelector("#div2")
//     var h2=document.querySelector("h2")
//     var randomValue=genarateRandom()
//     div2.style.background=randomValue
//     h2.innerText=randomValue

// }

//  var inp=document.querySelector("#inp")
//  var btn=document.querySelector("#btn")
//  btn.addEventListener("click",()=>
//  {
//     var ans=inp.value
//     console.log(ans)
//  })

// var inp=document.querySelector("input")
// var btn=document.querySelector("#btn")
// btn.addEventListener("click",()=>{
//     var ans=parseInt(inp.value)
//     for(let i=0;i<ans;i++){
//         var div1=document.createElement("div")
//         // var inp=document.querySelector("input")
//     // console.log(ans)
//     div1.style.height="100px"
//     div1.style.width="100px"
//     div1.style.background=generate()

//     document.body.appendChild(div1)
//     }
// })

// function generate()
// {
//     var ans=Math.floor(Math.random()*10000)
//     return `#${ans}`
// }
// console.log(generate())

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
        h2.innerText= div1.style.height="100px"
        
      
        div1.style.width="100px"
        div1.style.background=generated
        aside.body.appendChild(div1)
    }
})