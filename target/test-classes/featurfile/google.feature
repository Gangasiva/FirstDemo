Feature: open google.com feature
Scenario: open google website and search
Given user is entering google.com
When user click the searchbox
And enter the key value
Then the user should see the search result