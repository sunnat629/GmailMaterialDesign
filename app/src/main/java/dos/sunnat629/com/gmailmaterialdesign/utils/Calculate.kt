package dos.sunnat629.com.gmailmaterialdesign.utils

import android.content.Context
import android.graphics.Color
import android.os.Build
import java.time.LocalDate
import java.util.*


object Calculate {

    fun getRandomBoolean(): Boolean {
        return Math.random() < 0.5
    }

    fun createRandomIntBetween(start: Int, end: Int): Int {
        return start + Math.round(Math.random() * (end - start)).toInt()
    }

    fun createRandomDate(startYear: Int, endYear: Int): LocalDate {
        val day = createRandomIntBetween(1, 28)
        val month = createRandomIntBetween(1, 12)
        val year = createRandomIntBetween(startYear, endYear)
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalDate.of(year, month, day)
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }

    fun getRandomMaterialColor(): Int {
        val random = Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))

    }

    private fun getRandomMaterialColor(mContext: Context,  typeColor: String): Int {
        var returnColor = Color.GRAY
        val arrayId = mContext.resources.getIdentifier("mdcolor_$typeColor", "array",mContext.packageName)

        if (arrayId != 0) {
            val colors =  mContext.resources.obtainTypedArray(arrayId)
            val index = (Math.random() * colors.length()).toInt()
            returnColor = colors.getColor(index, Color.GRAY)
            colors.recycle()
        }
        return returnColor
    }
}