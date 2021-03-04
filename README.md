# Spring-Boot-Practice-W-David

Sprint 1
Prototypes
Rapid Prototyping

Prototype pages for:

All:

Categories
Hashtags
Two single pages for each:

Review
Category
Tag
Hard code all data and make sure all links connect to the right pages

Make HTML pages for each of these entities and add CSS styling.

Sprint 2
Goal - Class Design and Templates
Use static resources to start building out each section of the MVC structure

The classes that make up the Model section.
The templates that make up the View section.
The classes that make up the Controller section.
Simulate a data layer that will provide storage for your content.
Model
Use the data that you put in your static pages to guide the creation of all of your models. Now that you have pages for two Reviews, two Categories, and two Hashtags, you can actually use that data to inform exactly what fields you model Objects will need.

View
To build our view layer, all we need to do is make templates out of the static pages that we created and convert them to Thymeleaf files

Controller
Our controllers are going to control two important functions, defining request routing (directing traffic) and executing tasks based on the endpoint that is requested. The controllers should communicate with services that provide data and add data to the model object and then pass the model object to the view.

To build a controller you need to have an idea on how your pages are linked together and what data needs to be populated into the model for each template that is returned by that method/endpoint.

Data Layer
Create a class that corresponds to each Model element that will contain a collection of example elements along with methods to retrieve them in specific ways (i.e. findAll, findById, etc.). Naming should reflect the data that is held in that service. (i.e. ReviewService)

Thymeleaf Tips
Iteration
We use th:each to iterate over collections in Thymeleaf. If I had a collection called widgets in my model, each of these having a name attribute, I would do the following to generate a <div> for each of these. widget is the name of my iteration variable, much like the for each loops you're familar with:

<div th:each="widget: ${widgets}" th:text="${widget.name}" />
This would result in something like the following, given the names "fee", "fie", and "foe":

<div>fee</div>
<div>fie</div>
<div>foe</div>
(See the tutorial section on iteration.)

Link URLs
Link urls have a special syntax in Thymeleaf, the @ syntax: @{...}. If I had an object called foo in the model, with a getId() method, and wanted to create a query parameter with the id, I would reference it as follows:

<a th:href="@{'/things/'+${thing.id}}">link text</a>
This would result in the following being rendered, assuming that thing.getId() returns 42:

<a href="/things/42">link text</a>
(See the tutorial section on link urls.)

Materials
Thymeleaf
Thymeleaf
Thymeleaf Tutorial
Thymeleaf Interactive Tutorial
Resources
The official Spring Boot Docs
Test Doubles - Fakes, Mocks, and Stubs
Sprint 3
Materials
JPA

JPA Docs

H2

Persisting a DB

Spring Data JPA reference

Query methods - Query creation
Repository query keywords
Repository query return types
Goal
Include and incorporate an actual database to store our data.
Maintain all current Objects and add support for database management
Sprint 4
Goal
Make it so a user can add multiple hashtags at one time
Add ability to add comments to reviews. Comments should be listed on a review's page after the review's content.
Sprint 5
Landing the plane!

Day 1
Finish features
Finalize integration tests.
Day 2
Bug fixes
Finalizing styling
Day 3
Presentations
Reflection