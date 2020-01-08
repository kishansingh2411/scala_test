package testnew

import scala.collection.immutable.HashSet

object find_arr_dups {
  def find_dups(arr:Array[Int]):Array[Int]={
    var hs : HashSet[Int] = HashSet.empty
    for(i<- 0 to arr.length -1){
      if(!hs.contains(arr(i))){
        hs+=arr(i)
      }
    }
    hs.toArray
  }
  def main(args: Array[String]): Unit = {
    var arr = Array(1,1,1,2,3,5,7,4,65,5,5,4,4,5,4,6,65,5,5,6)
    var k = find_dups(arr)
    for(i<- k) println(i)
  }
}
