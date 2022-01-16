import turtle
import keyboard
import time
import winsound
outer_condition = True
while outer_condition == True:

    #making a console screen
    window = turtle.Screen()
    window.title("PONG by Abdul Rafay")
    window.bgcolor("black")
    window.setup(width = 1000,height = 600,)
    window.tracer(0)
    score1 = 0
    score2 = 0

    #draw paddles and ball
    class paddle(turtle.Turtle):
        def __init__(self):
            turtle.Turtle.__init__(self)
            self.penup()
            self.shape("square")
            self.color("cyan")
            self.speed(0)
            self.shapesize(stretch_wid=5,stretch_len=1)
    paddle1 = paddle()
    paddle1.goto(-470,0)
    paddle2 = paddle()
    paddle2.goto(470,0)
    ball = paddle()
    ball.shape("circle")
    ball.goto(0,0)
    ball.shapesize(stretch_wid=1,stretch_len=1)

    #paddle movement functions
    def paddle1_up():
        y = paddle1.ycor()
        y += 30
        paddle1.sety(y)
        if paddle1.ycor() >= 240:
            paddle1.sety(240)
    def paddle1_down():
        y = paddle1.ycor()
        y -= 30
        paddle1.sety(y)
        if paddle1.ycor() <= -230:
            paddle1.sety(-230)
    def paddle2_up():
        y = paddle2.ycor()
        y += 30
        paddle2.sety(y)
        if paddle2.ycor() >= 240:
            paddle2.sety(240)
    def paddle2_down():
        y = paddle2.ycor()
        y -= 30
        paddle2.sety(y)
        if paddle2.ycor() <= -230:
            paddle2.sety(-230)

    #movement
    window.listen()
    window.onkeypress(paddle1_up,"w")
    window.onkeypress(paddle1_down,"s")
    window.onkeypress(paddle2_up,"Up")
    window.onkeypress(paddle2_down,"Down")

    #text on the screen for score
    text = turtle.Turtle()
    text.color("cyan")
    text.speed(0)
    text.penup()
    text.hideturtle()
    text.goto(0,260)
    text.write("Player A:{}  Player B:{}".format(score1,score2), align="Center", font=("Courier",24,"normal"))
    text2 = turtle.Turtle()
    text2.color("cyan")
    text2.speed(0)
    text2.penup()
    text2.hideturtle()
    text2.goto(0,-260)
    text2.write("First to 3 wins!",align="Center", font = ("Courier",24,"normal"))

    #ball move difference
    ball.dx = 0.3
    ball.dy = -0.3

    #main game loop
    ending_condition = True
    while ending_condition:
        ball.clear()
        ball.setx(ball.xcor() + ball.dx)
        ball.sety(ball.ycor() + ball.dy)

        #border collision
        if ball.ycor() > 290:
            ball.sety(290)
            ball.dy *= -1
        if ball.ycor() < -290:
            ball.sety(-290)
            ball.dy *= -1

        #score increment
        if ball.xcor() > 500:
            ball.goto(0,0)
            ball.dx *= -1
            text.clear()
            score1 += 1
            text.write("Player A:{}  Player B:{}".format(score1, score2), align="Center", font=("Courier", 24, "normal"))
        if ball.xcor() < -500:
            ball.goto(0,0)
            ball.dx *= -1
            text.clear()
            score2 += 1
            text.write("Player A:{}  Player B:{}".format(score1, score2), align="Center", font=("Courier", 24, "normal"))

        #collision with paddle
        if (ball.xcor() > 460 and ball.xcor() <470) and (ball.ycor() > paddle2.ycor()-70 and ball.ycor() < (paddle2.ycor() +70)):
            ball.setx(460)
            ball.dx *= -1
        if (ball.xcor() < -455 and ball.xcor() > -470) and (ball.ycor() > paddle1.ycor()-70 and ball.ycor() < (paddle1.ycor() +70)):
            ball.setx(-455)
            ball.dx *= -1

        #if (ball.ycor()>= 0 and ball.ycor() <= 600) and (ball.xcor() == 0):
         # ball.clear()

        if score1 == 3 or score2 == 3:
            ending_condition = False

        window.update()
        ball.clear()

    #who won window
    window.clear()
    window.bgcolor("black")
    text3 = turtle.Turtle()
    text3.color("cyan")
    text3.speed(0)
    text3.penup()
    text3.hideturtle()
    text3.goto(0,0)
    if score1 == 3:
        text3.write("Player A won!",align="Center", font = ("Courier",24,"normal"))
    else:
        text3.write("Player B won!", align="Center", font=("Courier", 24, "normal"))

    #continue playing or exit
    text4 = turtle.Turtle()
    text4.color("cyan")
    text4.speed(0)
    text4.penup()
    text4.hideturtle()
    text4.goto(0, -60)
    text4.write("C To Continue", align="center", font = ("Courier", 24,"normal"))
    text4.goto(0,-120)
    text4.write("Q To Exit", align = "center" , font = ("courier",24,"normal"))

    while True:
        window.update()

        #checking for outer loop condition
        if keyboard.is_pressed("q") or keyboard.is_pressed("Q"):
            outer_condition = False
            break
        elif keyboard.is_pressed("c") or keyboard.is_pressed("C"):
             outer_condition = True
             text4.clear()
             text3.clear()
             break
