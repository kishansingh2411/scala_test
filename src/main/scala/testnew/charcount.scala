package testnew

object charcount {
  def charcount_str(str:String):(Char,Int)={
  var curr_count=1
  var count=0
  var res = str(0)
  for(i<- 0 to str.length-1) {
    if(i<str.length-1 && (str(i)==str(i+1))){
      curr_count+=1
    } else {
      if(curr_count>count){
        count=curr_count
        res=str(i)
      }
      curr_count=1
    }
  }
  (res,count)
}
 def main(args: Array[String]): Unit = {
   var str = "aaaaasadsjffdkgggggggfgfgj"
   println(charcount_str(str))
 }
}
