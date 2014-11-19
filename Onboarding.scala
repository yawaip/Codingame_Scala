object Player {

    def main(args: Array[String]) {

        // game loop
        while(true) {
            val count = readInt // The number of current enemy ships within range
            val ab = new Array[(String,Int)](count);
            for(i <- 0 until count) {
                // enemy: The name of this enemy
                // dist: The distance to your cannon of this enemy
                val Array(_enemy, _dist) = readLine split " "
                ab(i) = (_enemy, _dist.toInt);
            }
            //ab
            val sorted = ab.sortBy(_._2);
            println(sorted(0)._1);
            //Console.err.println(sorted.deep)
            // Write an action using println
            // To debug: Console.err.println("Debug messages...")
            //println(sorted(0)._1)
            
        }
    }
}