var animal=[{
     name1:"tiger",
     img:"https://th.bing.com/th/id/OIP.pdnG7dX_A8kdOD1uemUxBQHaHa?pid=ImgDet&w=1200&h=1200&rs=1"
     },
     {
          name1:"lion",
          img:"https://i.pinimg.com/originals/0c/20/1c/0c201c58a27ec1dc6560e2d7c3d0db83.jpg"
     },
     {
          name1:"elephjant",
          img:"https://th.bing.com/th/id/R.2926a5ae06973f92ae90a8b6eea5bb34?rik=P%2bhKlFdco0r1bA&riu=http%3a%2f%2f1.bp.blogspot.com%2f-WQCcKX8APP8%2fUbbGtXQTPAI%2fAAAAAAAAHRY%2fb8jH8HT6Kzw%2fs1600%2fAfrican-Elephant.JPG&ehk=tH3jlKYo80Xsd7pzOgWJL4IxKU7rTHuibDLGX%2bkACb4%3d&risl=&pid=ImgRaw&r=0"
     },
     {
          name1:"dog",
          img:"https://www.petfriendlyhouse.com/wp-content/uploads/2019/09/Beagle-medium-sized-dog.jpg"
     },
     ]
     var num=0;
     var img=document.querySelector("img")
     var h2=document.querySelector("h2")
     var prev =document.querySelector("#prev")
     var nxt =document.querySelector("#nxt")

prev.addEventListener("click",()=>{
     if(num<0){
     num=animal.length-1;
}
h2.innerText=animal[num].name1
img.src=animal[num].img
num--})

nxt.addEventListener("click",()=>{
     if(num>animal.length-1){
     num=0;
}
h2.innerText=animal[num].name1
img.src=animal[num].img
num++

})