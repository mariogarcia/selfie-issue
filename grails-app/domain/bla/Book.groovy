package bla

import com.bertramlabs.plugins.selfie.Attachment

class Book {
  String name
  Attachment photo

  static attachmentOptions = [
    photo: [
      styles: [
        thumb: [width: 50, height: 50, mode: 'fit'],
        medium: [width: 250, height: 250, mode: 'scale']
      ]
    ]
  ]

  static embedded = ['photo'] //required

  static mapping = { }

  static constraints = {
    photo contentType: ['png','jpg'], fileSize:1024*1024 // 1mb
  }
}
