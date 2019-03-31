package dos.sunnat629.com.gmailmaterialdesign.model.entities

class MailContent() {
    private var id: Int = 0
    lateinit var receiver: String
    var totalMail: Int = 0
    lateinit var latestMailingTime: String
    lateinit var mailSubject: String
    lateinit var lastMainContent: String
    var isImportant: Boolean = false
    var isStared: Boolean = false
    var isRead: Boolean = false
    lateinit var image: String

    constructor(
        from: String,
        totalMail: Int,
        latestMailingTime: String,
        mailSubject: String,
        lastMainContent: String,
        isImportant: Boolean,
        isStared: Boolean,
        isRead: Boolean,
        image: String
    ) : this() {
        this.receiver = from
        this.totalMail = totalMail
        this.latestMailingTime = latestMailingTime
        this.mailSubject = mailSubject
        this.lastMainContent = lastMainContent
        this.isImportant = isImportant
        this.isStared = isStared
        this.isRead = isRead
        this.image = image
    }
}