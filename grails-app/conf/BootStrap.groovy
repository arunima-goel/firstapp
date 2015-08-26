import org.mycompany.*

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) {
            def name1 = new Person(firstName: "fname1", lastName: "lname1").save(failOnError: true)
            def name2 = new Person(firstName: "fname2", lastName: "lname2").save(failOnError: true)
            def name3 = new Person(firstName: "fname3", lastName: "lname3").save(failOnError: true)
            def name4 = new Person(firstName: "fname4", lastName: "lname4").save(failOnError: true)
            def name5 = new Person(firstName: "fname5", lastName: "lname5").save(failOnError: true)
            def name6 = new Person(firstName: "fname6", lastName: "lname6").save(failOnError: true)
            def name7 = new Person(firstName: "fname7", lastName: "lname7").save(failOnError: true)
            def name8 = new Person(firstName: "fname8", lastName: "lname8").save(failOnError: true)
            def name9 = new Person(firstName: "fname9", lastName: "lname9").save(failOnError: true)

            name1.addToAddresses(
                    new Address(streetAddress: "streetAddress11", city: "city11", state: "TX", zipCode: "00011")
            ).addToAddresses(
                    new Address(streetAddress: "streetAddress12", city: "city12", state: "IN", zipCode: "00012")
            ).addToAddresses(
                    new Address(streetAddress: "streetAddress13", city: "city13", state: "NY", zipCode: "00013")
            ).save(flush:true, failOnError: true)

            name2.addToAddresses(
                    new Address(streetAddress: "streetAddress21", city: "city21", state: "NY", zipCode: "00021")
            ).save(failOnError: true)

            name3.addToAddresses(
                    new Address(streetAddress: "streetAddress31", city: "city31", state: "NY", zipCode: "00031")
            ).save(failOnError: true)

            name4.addToAddresses(
                    new Address(streetAddress: "streetAddress41", city: "city41", state: "NY", zipCode: "00041")
            ).save(failOnError: true)

            name5.addToAddresses(
                    new Address(streetAddress: "streetAddress51", city: "city51", state: "NY", zipCode: "00051")
            ).save(failOnError: true)

            name6.addToAddresses(
                    new Address(streetAddress: "streetAddress61", city: "city61", state: "NY", zipCode: "00061")
            ).save(failOnError: true)

            name7.addToAddresses(
                    new Address(streetAddress: "streetAddress71", city: "city71", state: "NY", zipCode: "00071")
            ).save(failOnError: true)

            name8.addToAddresses(
                    new Address(streetAddress: "streetAddress81", city: "city81", state: "NY", zipCode: "00081")
            ).save(failOnError: true)

            name9.addToAddresses(
                    new Address(streetAddress: "streetAddress91", city: "city91", state: "NY", zipCode: "00091")
            ).save(failOnError: true)
        }

    }
    def destroy = {
    }
}
