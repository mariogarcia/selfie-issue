grails {
    plugin {
        karman {
	        serveLocalStorage = true
	        serveLocalMapping = 'storage' // means /storage is base path
	        storagePath = '/path/to/filestore'
	        defaultFileACL = com.bertramlabs.plugins.karman.CloudFileACL.Private
        }
        selfie {
            storage {
                path = 'uploads/:class/:id/:propertyName/' //This configures the storage path of the files being uploaded by domain class name and property name and identifier in GORM
                bucket = 'uploads'
                providerOptions {
                    provider = 'local' // Switch to s3 if you wish to use s3 and install the karman-aws plugin
                    basePath = 'storage'
                    baseUrl  = 'http://localhost:8080/image-test/storage'
                    defaultFileACL = com.bertramlabs.plugins.karman.CloudFileACL.Private
                    //accessKey = "KEY" //Used for S3 Provider
                    //secretKey = "KEY" //Used for S3 Provider
                }
            }
        }
    }
}
