Problem summary:

## Lab 06: Inheritance and Interfaces

1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
Implement a constructor for a Shop.
Implement a reasonable toString method for Shops.
Add tests for the basics of your Shop class.

2. The users also want to review shops!
It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and make this possible.
Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.
Write tests for this functionality.

3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
Implement a constructor for a Theater.
Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.
Implement a reasonable toString method for Theaters.
Test your Theater functionality.

4. Review all the things!
Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
Test this functionality.

5. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.
Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!
It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn).
Add testing for any new functionality you’ve created.

## Directions for testing:
The following tests were created for testing the functionality of restaurant.java:
  testConstructor: tests if restaurant constructor is created properly and .tostring method is functional.
  testUpdatedRating: tests if .tostring is outputting updated review that's assosiated with the customer specified.
  testIfMultipleReviewsAdded: tests if mutiple reviews are being stored
  
  The following tests were created for testing the functionality of restaurant.java:
    testConstructor: tests if review constructor is created properly and .tostring method is functional.
    estIfGettingRestaurant: tests if name of restaurant is being updated from the information passed from restaurant      constructor.
  
  

[Link to Restaurant.java](https://github.com/sadhikari07/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Restaurant.java)

[Link to review.java](https://github.com/sadhikari07/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Review.java)

[Link to RestaurantTest.java](https://github.com/sadhikari07/java-fundamentals/blob/master/inheritance/src/test/java/inheritance/RestaurantTest.java)

[Link to ReviewTest.java](https://github.com/sadhikari07/java-fundamentals/blob/master/inheritance/src/test/java/inheritance/ReviewTest.java)
