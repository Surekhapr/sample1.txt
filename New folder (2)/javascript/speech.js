let txt=document.getElementById("txt")
let num=document.getElementById("num")
let play=document.getElementById("play")
play.addEventListener("click",()=>{
    max(txt.value)


})

function max(nan)
{
    let speech=new SpeechSynthesisUtterance(nan)
    speechSynthesis.speak(speech)
    speech.rate=Range.value
}