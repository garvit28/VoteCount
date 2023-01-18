# VoteCount
There are  5 features implemented in the given Project, they are as follow=>
1. Entering/adding Candidate with initial vote count of 0.
2. Casting vote, here the vote is cast for Candidates. 
3. Counting vote shows how many votes have been cast foe a perticular user.
4. List of Candidates shows a list of all candidates with vote count.
5. Get Winner method gives the Winner of the election by counting the votes.


======================================================================================

# Architecture

For implementing all above mention features, the architecture used is a 3-Tier architecture.
As the 1st layer of the architecture isthe Controller Class which is used to handle multiple uers.
As the 2st layer of the architecture is Service layer i.e VoteServce where all the logic is implemented
As here we are using Local Variable to Store Data Not a Database So 3rd layer was not implemented.
