object L6_q {

    // Encryption function for Caesar cipher
    def caesarEncrypt(plain_text: String, encrypt_shift: Int): String = {
      val encryptedText = plain_text.map { char =>
        if (char.isLetter) { //checking the character is a letter or a symbol
          val isUppercase = char.isUpper //
          val asciiOffset = if (isUppercase) 65 else 97
          val shiftedChar = ((char.toInt - asciiOffset + encrypt_shift) % 26 + asciiOffset).toChar //shifting the characters according to the ascii valuess
          if (isUppercase) shiftedChar else shiftedChar.toLower //if a character is a uppercase the changes into it to lower case
        } else {
          char //neither it is a uppercase or a lower case letter it returns the symbol
        }
      }
      encryptedText.mkString
    }

    // Decryption function for Caesar cipher
    def caesarDecrypt(ciphertext: String, decrypt_shift: Int): String = {
      caesarEncrypt(ciphertext, -decrypt_shift) // Decryption is just encryption with negative shift
    }

    // Cipher function to process the data using the provided encryption/decryption function
    def cipher(processFunction: (String, Int) => String, data: String, key: Int): String = {
      processFunction(data, key)
    }

    def main(args: Array[String]): Unit = {
      val shiftValue = 3
      val message = "Hello, Caesar cipher!"

      val encrypt_Message = cipher(caesarEncrypt, message, shiftValue)
      val decrypt_Message = cipher(caesarDecrypt, encrypt_Message, shiftValue) //decryption has to be done to an encrypted message

      println(s"Original Message: $message")
      println(s"Encrypted Message: $encrypt_Message")
      println(s"Decrypted Message: $decrypt_Message")
    }



}