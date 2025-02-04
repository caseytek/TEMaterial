package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
<<<<<<< HEAD
		System.out.println(remainingNumberOfBirds);
=======
		
		System.out.println(remainingNumberOfBirds);

>>>>>>> 54b8bbe87c32c85116d16bca8fa6ebe2b982a30e
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoons = 3;
		int missingRacoons = 2;
		int leftOverRacoons = numberOfRacoons - missingRacoons;
		System.out.println(leftOverRacoons);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = flowers - bees;
		System.out.println(lessBeesThanFlowers);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1;
		int totalPigeons = firstPigeon + secondPigeon;
		System.out.println(totalPigeons);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int originalOwls = 3;
		int extraOwls = 2;
		int totalOwls = originalOwls + extraOwls;
		System.out.println(totalOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int originalBeavers = 2;
		int missingBeavers = 1;
		int leftOverBeavers = originalBeavers - missingBeavers;
		System.out.println(leftOverBeavers);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int originalToucans = 2;
		int extraToucans = 1;
		int totalToucans = originalToucans + extraToucans;
		System.out.println(totalToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsMinusNuts = squirrels - nuts;
		System.out.println(squirrelsMinusNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarterValue = .25;
		double dimeValue = .10;
		double nickelValue = .05;
		double totalMoney = (quarterValue + dimeValue + nickelValue + nickelValue);
		System.out.printf("$" + "%.2f\n", totalMoney);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersClassMuffins = 18;
		int macadamsClassMuffins = 20;
		int flanneryClassMuffins = 17;
		int totalMuffins = briersClassMuffins + macadamsClassMuffins + flanneryClassMuffins;
		System.out.println(totalMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = .24;
		double whistleCost = .14;
		double totalCost = yoyoCost + whistleCost;
		System.out.println("$" + totalCost);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalRiceKrispies= 5;
		int totalMarshmallows = (largeMarshmallows + miniMarshmallows) * totalRiceKrispies;
		System.out.println(totalMarshmallows);
		/*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouseSnow = 29;
		int elementarySchoolSnow = 17;
		int hiltExtraSnow = hiltHouseSnow - elementarySchoolSnow;
		System.out.println(hiltExtraSnow);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int originalMoney = 10;
		int toyTruckCost = 3;
		int pencilCaseCost = 2;
		int remainingMoney = originalMoney - toyTruckCost - pencilCaseCost;
		System.out.println("$" + remainingMoney);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int beginningMarbles = 16;
		int lostMarbles = 7;
		int remainingMarbles = beginningMarbles - lostMarbles;
		System.out.println(remainingMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentSeashellNumber = 19;
		int desiredSeashellNumber = 25;
		int remainingSeashellsToFind = desiredSeashellNumber - currentSeashellNumber;
		System.out.println(remainingSeashellsToFind);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBallons = totalBalloons - redBalloons;
		System.out.println(greenBallons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int originalBooks = 38;
		int newBooks = 10;
		int totalBooks = originalBooks + newBooks;
		System.out.println(totalBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int numberOfBees = 8;
		int totalBeeLegs = beeLegs * numberOfBees;
		System.out.println(totalBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCost = .99;
		iceCreamCost += iceCreamCost;
		System.out.println(iceCreamCost);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int currentRocks = 64;
		int totalRocks = 125;
		int rocksNeeded = totalRocks - currentRocks;
		System.out.println(rocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int originalMarbles = 38;
		int missingMarbles = 15;
		int leftoverMarbles = originalMarbles - missingMarbles;
		System.out.println(leftoverMarbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int completedMiles = 32;
		int remainingMiles = totalMiles - completedMiles;
		System.out.println(remainingMiles);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayMorningShovelingMinutes = 90;
		int saturdayAfternoonShovelingMinutes = 45;
		int minutesInHour = 60;
		int hoursShoveling = (saturdayAfternoonShovelingMinutes + saturdayMorningShovelingMinutes) / minutesInHour;
		int minutesShoveling = (saturdayAfternoonShovelingMinutes + saturdayMorningShovelingMinutes) % 60;
		System.out.println(hoursShoveling + " Hours " + minutesShoveling + " Minutes");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogCost = 0.50;
		int totalHotDogs = 6;
		double totalHotDogCost = hotDogCost * totalHotDogs;
		System.out.printf("$" + "%.2f\n", totalHotDogCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltMoney = 0.50;
		double pencilCost = 0.07;
		int possibleTotalPencilPurchase =(int) (hiltMoney / pencilCost);
		System.out.println(possibleTotalPencilPurchase);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies =  totalButterflies - orangeButterflies;
		System.out.println(redButterflies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateMoney = 1;
		double candyCost = 0.54;
		double changeRemaining = kateMoney - candyCost;
		System.out.printf("$ " + "%.2f\n", changeRemaining);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int beginningTrees = 13;
		int newTrees = 12;
		int totalTrees = beginningTrees + newTrees;
		System.out.println(totalTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysUntilGrandma = 2;
		int hoursInDay = 24;
		int hoursUntilGrandma = daysUntilGrandma* hoursInDay;
		System.out.println(hoursUntilGrandma);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimCousins = 4;
		int gumPerCousin = 5;
		int totalGumNeeded = kimCousins * gumPerCousin;
		System.out.println(totalGumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danMoney = 3.00;
		double candyBarCost = 1.00;
		double remainingDanMoney = danMoney - candyBarCost;
		System.out.printf("$" + "%.2f\n", remainingDanMoney);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peoplePerBoat = 3;
		int peopleOnBoats = boats * peoplePerBoat;
		System.out.println(peopleOnBoats);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int originalLegos = 380;
		int lostLegos = 57;
		int remainingLegos = originalLegos - lostLegos;
		System.out.println(remainingLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int currentMuffins = 35;
		int desiredMuffins = 83;
		int muffinsToBake = desiredMuffins - currentMuffins;
		System.out.println(muffinsToBake);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int willyExtraCrayons = willyCrayons - lucyCrayons;
		System.out.println(willyExtraCrayons);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;
		System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerChildren = totalCupcakes / numberOfChildren;
		System.out.println(cupcakesPerChildren);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalCookies = 47;
		int cookiesPerJar = 6;
		int extraCookies = totalCookies % cookiesPerJar;
		System.out.println(extraCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissants = 59;
		int totalNeighbors = 8;
		int extraCroissants = totalCroissants % totalNeighbors;
		System.out.println(extraCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalOatmealCookies = 276;
		int cookiesOnTray = 12;
		int traysNeeded = totalOatmealCookies / cookiesOnTray;
		System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int pretzelServingSize = 12;
		int totalServingSizes = totalPretzels / pretzelServingSize;
		System.out.println(totalServingSizes);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int forgottenCupcakes = 2;
		int cupcakesPerBox = 3;
		int totalCupcakeBoxes = ((lemonCupcakes - forgottenCupcakes)/cupcakesPerBox);
		System.out.println(totalCupcakeBoxes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticks = 74;
		int totalPeople = 12;
		int uneatenCarrots = totalCarrotSticks % totalPeople;
		System.out.println(uneatenCarrots);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilled = totalTeddyBears / teddyBearsPerShelf;
		System.out.println(shelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480;
		int albumCapacity = 20;
		int albumsNeeded = totalPictures / albumCapacity;
		System.out.println(albumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int boxCapacity = 8;
		int boxesFilled = totalTradingCards / boxCapacity;
		int extraCards = boxesFilled % boxCapacity;
		System.out.println(boxesFilled + " boxes filled" + " and " + extraCards + " cards in the unfilled box");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susiesFathersBooks = 210;
		int totalRepairedShelves = 10;
		int booksPerRepairedShelf = susiesFathersBooks / totalRepairedShelves;
		System.out.println(booksPerRepairedShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int cristinasCroissants = 17;
		int cristinasGuests = 7;
		int croissantPerGuest = cristinasCroissants / cristinasGuests;
		System.out.println(croissantPerGuest);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		int oneRoom = 1;
		double billPaintingRate = oneRoom / 2.15; //.47 rooms per hour
		double jillPaintingRate = oneRoom/ 1.9; // .52 rooms per hour
		double billAndJillPaintingRate = billPaintingRate + jillPaintingRate; // .99 rooms per hour
		double timeToPaintFiveRooms = 5 / billAndJillPaintingRate;
		System.out.println("Q.51a " + timeToPaintFiveRooms);
		int hoursOfPaintingPerDay = 8;
		double roomsPaintedPerDay = hoursOfPaintingPerDay * billAndJillPaintingRate;
		int roomsToBePainted = 623;
		double daysToPaintRooms = (roomsToBePainted / roomsPaintedPerDay);
		System.out.println("Q.51a " + daysToPaintRooms + " days to paint all the rooms");
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Casey";
		String lastName = "Tek";
		String middleInitial = " M.";
		String fullName =lastName + ", "+ firstName + middleInitial;
		System.out.println(fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		double nyChicagoDistance = 800;
		double milesCompleted = 537;
		int percentConverterUnit = 100;
		double percentCompleted =((milesCompleted / nyChicagoDistance)* percentConverterUnit) ;
		System.out.printf("%2.0f\n", percentCompleted);
	}

}
