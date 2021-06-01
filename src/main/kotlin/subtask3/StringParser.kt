package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var indexClosed: Int
        var symbol: String

        var result = mutableListOf<String>()

        var indexStart = 0
        var srcString = inputString

        while(indexStart != -1) {

            indexStart  = srcString.indexOfAny(listOf("(", "[", "<"), 0)

            if (indexStart == -1)
                continue

            symbol      = srcString[indexStart].toString()
            srcString   = srcString.substring(startIndex = indexStart+1)

            if (symbol == "(") {
                indexClosed = srcString.indexOf(")")
                if (indexClosed != -1) {
                    result.add(srcString.substring(0, indexClosed))
                }
            }

            if (symbol == "[") {
                indexClosed = srcString.indexOf("]")
                if (indexClosed != -1) {
                    result.add(srcString.substring(0, indexClosed))
                }
            }

            if (symbol == "<") {
                indexClosed = srcString.indexOf(">")
                if (indexClosed != -1) {
                    result.add(srcString.substring(0, indexClosed))
                }
            }

            //srcString = srcString.substring(startIndex = indexStart+1)
        }

        return result.toTypedArray()


        //throw NotImplementedError("Not implemented")
    }
}
