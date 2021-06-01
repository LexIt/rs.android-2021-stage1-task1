package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sum: Int
        var result = mutableListOf<Int>()
        var currValue: Int

        if(sadArray.size <= 2){
            return sadArray
        }

        for(i in 0 until sadArray.size){
            currValue = sadArray[i]
            if(i != 0 && i != sadArray.lastIndex){
                sum = result[result.lastIndex] + sadArray[i+1] //last good plus next after current

                if(sum >= currValue) {
                    result.add(currValue) //All ok - adding new value
                }
                else
                {
                    //Need check prev values
                    if(result.size<2){
                        continue
                    }
                    for(k in result.size-1 downTo 1){
                        if(result[k]>result[k-1]+sadArray[i+1])
                        {
                            result.removeAt(k)
                        }
                        else
                        {
                            break
                        }
                    }
                }
            }
            else {
                result.add(currValue) //First and last - always happy
                continue
            }
        }

        return result.toIntArray()
        //throw NotImplementedError("Not implemented")
    }
}
