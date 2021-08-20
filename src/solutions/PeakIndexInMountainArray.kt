package solutions

class PeakIndexInMountainArray {

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.size - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return start
    }
}