fun rgb(r: Int, g: Int, b: Int): String {
  // complete this function
    fun clamp(value:Int): Int = value.coerceIn(0, 255)
    
    // the above means to create a function that takes an Int called value
    // and returns an Int and force that value to be between 0 and 255
    
    // coerceIn(0, 255) ensure everything below 0 becomes 0 and anything above 255 becomes 255
    
    return "%02X%02X%02X".format(
        clamp(r),
        clamp(g),
        clamp(b)
    
    ) // 02 means width of 2 characters, X means uppercase hexadecimal
    
}