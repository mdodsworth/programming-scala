object ForLoopPlaying {
    def main(args:Array[String]) = {
        for (string <- args
            if string.length > 3;
            if string.length < 5) println(string)
    }
}
