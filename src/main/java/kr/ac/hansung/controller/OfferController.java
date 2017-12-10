package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;


@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private OfferService offerService2;
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent(2012, 1);
		List<Offer> offers2 = offerService.getCurrent(2012, 2);
		List<Offer> offers3 = offerService.getCurrent(2013, 1);
		List<Offer> offers4 = offerService.getCurrent(2013, 2);
		List<Offer> offers5 = offerService.getCurrent(2017, 1);
		model.addAttribute("offers", offers);
		model.addAttribute("offers2", offers2);
		model.addAttribute("offers3", offers3);
		model.addAttribute("offers4", offers4);
		model.addAttribute("offers5", offers5);
		
		return "offers";
	}
	
	@RequestMapping("/offers2")
	public String showOffers2(Model model) {
		List<Offer> offers6 = offerService2.getCurrent2("교필");
		List<Offer> offers7 = offerService2.getCurrent2("핵교A");
		List<Offer> offers8 = offerService2.getCurrent2("전지");
		List<Offer> offers9 = offerService2.getCurrent2("전기");
		List<Offer> offers10 = offerService2.getCurrent2("전선");
		model.addAttribute("offers6", offers6);
		model.addAttribute("offers7", offers7);
		model.addAttribute("offers8", offers8);
		model.addAttribute("offers9", offers9);
		model.addAttribute("offers10", offers10);
		
		return "offers2";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model) {
		
		model.addAttribute("offer", new Offer());
		return "createoffer";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		offerService.insert(offer);
		return "offercreated";
	}
	
	@RequestMapping("/viewoffer")
	public String viewOffer(Model model) {
		
		model.addAttribute("offer", new Offer());
		return "createoffer";
	}
}
