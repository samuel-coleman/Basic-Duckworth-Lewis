println("For use in 40 over games")
print("First innings overs lost: ")
var OverLostF = scala.io.StdIn.readFloat()
print("First innings score: ")
var scoreF = scala.io.StdIn.readFloat()

print("Second Innings overs lost including losses from First Innings: ")
var OverLostS = scala.io.StdIn.readFloat()
print("Second Innings Wickets lost before rain break: ")
var WickLostS = scala.io.StdIn.readFloat()

var overPerF = 1-(OverLostF/40)

var overPerS = 1-(OverLostS/40)
var wickPerS = 1-(WickLostS/10)

var resF = overPerF
var resS = (overPerS+wickPerS)/2
var scoreS = scoreF

if(OverLostF==0.0){
	scoreS = scoreF*resS
}
else{
	scoreS = scoreF*(resS/resF)
}

scoreS.toInt

println("Second Innings DL Target Score: "+(scoreS+1))