

function play() {
    var randomNumber1=Math.floor(Math.random()*6+1);
var randomNumber2=Math.floor(Math.random()*6+1);

var randomDiceNo="dice"+randomNumber1+".png";

var randomDiceNo2="dice"+randomNumber2+".png";

var randomImageSource="images/"+randomDiceNo;
var randomImageSource2="images/"+randomDiceNo2;

var image1=document.querySelectorAll("img")[0];
image1.setAttribute("src",randomImageSource);

var image2=document.querySelectorAll("img")[1];
image2.setAttribute("src",randomImageSource2);

if(randomNumber1 > randomNumber2)
{
  type();
  window.scrollTo(0,1000);
  setTimeout(function () {
    location.reload();

  },2000);
}
else if(randomNumber1<randomNumber2)
{
    type2();
    window.scrollTo(0,1000);
    setTimeout(function () {
        location.reload();
    
      },2000);
}
else
{
    type3();
    window.scrollTo(0,1000);
    setTimeout(function () {
        location.reload();
    
      },2000);
  /* document.querySelector("h1").innerHTML="DRAW... ⚐ ";*/
}


function type() {
    var i=0;
    var txt='Player 1 Won.. 🏆'
    var speed=50;
    win1();
    function win1() {
        if(i<txt.length)
    {
        document.querySelector("h1").innerHTML += txt.charAt(i);
        i++;
        setTimeout(win1,speed);
    }
  
    }
 
}

function type2() {
    var i=0;
    var txt='Player 2 Won.. 🏆'
    var speed=50;
    win2();
    function win2() {
        if(i<txt.length)
    {
        document.querySelector("h1").innerHTML += txt.charAt(i);
        i++;
        setTimeout(win2,speed);
    }
    }
    
   
}

function type3() {
    var i=0;
    var txt='DRAW... ⚐ '
    var speed=50;
    draw();
    function draw() {
        if(i<txt.length)
    {
        document.querySelector("h1").innerHTML+=txt.charAt(i);
        i++;
   setTimeout(draw,speed);
    }

    }
    
   
   
}
  
  
    
}