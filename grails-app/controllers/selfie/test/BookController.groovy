package selfie.test

import bla.Book

class BookController {
 def upload() {
    def photo = new Book(params)
    if(!photo.save()) {
      println "Error Saving! ${photo.errors.allErrors}"
    }
    redirect view: "index"
  }
}
