package booker

class Book {

    String id
    String title
    String author
    String rev
    int ratings

    static constraints = {

    }

    Map asMap() {
        Map properties = this.getProperties()
        Map nonNullProperties = properties.findAll  {it.value != null}
        return  nonNullProperties
    }
}
