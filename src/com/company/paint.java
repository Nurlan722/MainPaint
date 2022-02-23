package com.company;

//we wrote a comment on each action of the participant because you could not link accounts in the repository
//the first two functions were written by Nurniyaz
//based on these functions Nurlan wrote the main parameters of the mouseDragged function
//after that, Nurniyaz wrote this part of the code:
//("reset-canvas").assEventListener("click", function(){saveCanvas(canvas, "sketch", "png");});

function (selector) {
    return document.querySelector(selector);
}
function setup() {
    let canvas = createCanvas(650, 600);
    canvas.parent("canvas-wrapper");
    background(255);
}
function mouseDragged(){
    let type = _("pen-pencil").checked?"pencil":"brush";
    let size = parseInt(_("pen-size").value);
    let color = _("pen-color").value;
    fill(color);
    stroke(color);
    if (type == "pencil"){
        line(pmouseX, pmouseY, mouseX, mouseY);
    } else {
        ellipse(mouseX, mouseY, size, size);
    }
}
("reset-canvas").assEventListener("click", function(){
    saveCanvas(canvas, "sketch", "png");
});
