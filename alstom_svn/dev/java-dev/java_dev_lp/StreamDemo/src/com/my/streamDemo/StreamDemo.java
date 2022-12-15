package com.my.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Movie> movieList = Arrays.asList(new Movie("Kadhalan", 1999, "Arvindswami"),
				new Movie("Kadhalan", 1999, "Prabhudeva"), new Movie("Padaiyappa", 2000, "Rajini"));

//		movieList.stream().filter(m -> m.getReleaseYear() == 1999).map(Movie::getMovieName)
//				.forEach(System.out::println);
//
		// Get list of movies name and add to list.
//		List<String> movieLists = movieList.stream().map(Movie::getMovieName).collect(Collectors.toList());
//		movieLists.forEach(System.out::println);
//
		// Get all the movies and add it to sets.
		// Set<String> movieSets = movieList.stream().map(Movie::getMovieName).collect(Collectors.toSet());
		// movieSets.forEach(System.out::println);
		
		
//
//		Join all the movie name with comma separated values
		String str = movieList.stream().map(Movie::getMovieName).collect(Collectors.joining(","));
		System.out.println(str);
		
		//Group Movie released in a yearof release
//		Map<Integer,List<Movie>>  movieMaps = movieList.stream().collect(Collectors.groupingBy(Movie:: getReleaseYear));
//		movieMaps.forEach((k,v) ->System.out.println("Key"+ k + "Value" + v ));
//		

		// Remove duplicate movie names.
		
		List<String> RemoveDupes = movieList.stream().map(Movie::getMovieName).distinct().collect(Collectors.toList());
		RemoveDupes.forEach(System.out::println);

//		List<Movie> RemoveDupes1 = movieList.stream()
//				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Movie::getMovieName))))
//				.stream().collect(Collectors.toList());
//		RemoveDupes1.forEach(System.out::println);
//		
//		List<Movie> distinctPeople = movieList.stream()
//	              .filter( distinctByKey(p -> p.getFname() + " " + p.getLname()) )
//	              .collect( Collectors.toList() );
	}

}
