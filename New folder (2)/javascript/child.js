var parent=document.querySelector(".parent")
var child=document.querySelector(".child")
var gc=document.querySelector(".gc")

parent.addEventListener("click",()=>{
    parent.style.background="red"
    console.log("iam a parent")
},true)

child.addEventListener("click",()=>{
    child.style.background="green"
    console.log("iam a child")
},true)

gc.addEventListener("click",()=>{
    gc.style.background="yellow"
    console.log("iam a grandchild")
},true)




