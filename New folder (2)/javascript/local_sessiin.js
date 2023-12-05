var name1=document.querySelector("#name1")
var idval=document.querySelector("#idval")
var phn=document.querySelector("#phn")
var storage=document.querySelector("#storage")
var local=document.querySelector("#local")
var session=document.querySelector("#session")
var get=document.querySelector("#get")
var remove=document.querySelector("#remove")
var clear=document.querySelector("#clear")
var add=document.querySelector("#add")

// var add=document.addEventListener("#add")
// var get=document.addEventListener("#get")
// var remove=document.addEventListener("#remove")
// var clear=document.addEventListener("#clear")
 


add.addEventListener("click",function(){
    var nval=name1.value
    var ival=idval.value
    var phn=phn.value
    var sval=storage.value

    console.log(nval)
    console.log(ival)
    console.log(phn)
    console.log(sval)
})
