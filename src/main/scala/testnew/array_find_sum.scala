package testnew

import sun.applet.Main
import scala.collection.mutable.HashSet

object array_find_sum {
  def sumofelement_1(arr:Array[Int],s:Int)={
    var arr_new = arr.sorted
    var low = 0
    var high = arr.length -1
    while (low < high) {
      if(arr_new(low) + arr_new(high) == s){
        println("combination is : "+arr_new(low),arr_new(high))
      } 
      if(arr_new(low) + arr_new(high) < s){
        low+=1
      } else high = high -1
    }
    
  }
  def sumofelement_2(arr:Array[Int],s:Int)={
    var hs:HashSet[Int]= HashSet.empty
    for (i <- 0 to arr.length -1){
      var tmp = s - arr(i)
      if(!hs.contains(tmp)){
        hs+=arr(i)
        println("combination from new method is : "+tmp,arr(i))
      }
    }
  }
  
  def main(args: Array[String]): Unit = {
    var arr = Array(2,3,4,4,5,6,7,8)
    var s = 11
    sumofelement_1(arr,s)
    sumofelement_2(arr,s)
  }
}
