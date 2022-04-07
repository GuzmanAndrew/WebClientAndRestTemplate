package com.javatechie.spring.client.api;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
@RequestMapping("/idscan")
public class BookmyshowWebclientApplication {

	WebClient webClient;

	@PostConstruct
	public void init() {
		webClient = WebClient.builder().baseUrl("https://app1.idware.net/DriverLicenseParserRest.svc").build();
	}

	@PostMapping("/parsing")
	public Mono<ParseResult> BookNow(@RequestBody BookRequest request) {
		return webClient.post()
				.uri("/Parse ")
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.body(BodyInserters.fromObject(request)).retrieve().bodyToMono(ParseResult.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookmyshowWebclientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
