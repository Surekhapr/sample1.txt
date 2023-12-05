var parent=document.querySelector(".parent")
var child=document.querySelector(".child")
var gc=document.querySelector(".grandchild")
parent.addEventListener("click",(e)=>{
    parent.style.background="red"
   // e.stopPropagation()
    console.log("iam a parent")
},true)

child.addEventListener("click",(e)=>{
    child.style.background="green"
    // e.stopPropagation()
    console.log("iam a child")
},true)

gc.addEventListener("click",(e)=>{
    gc.style.background="yellow"
   // e.stopPropagation()
    console.log("iam a grandchild")
},true)