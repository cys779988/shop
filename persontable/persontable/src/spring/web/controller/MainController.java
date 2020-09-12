package spring.web.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.svc.AdvertiseService;
import spring.web.svc.IngredientService;
import spring.web.svc.RecipeService;
import spring.web.vo.AdvertiseVO;
import spring.web.vo.IngredientVO;
import spring.web.vo.PageMaker;
import spring.web.vo.RecipeVO;
import spring.web.vo.SearchCriteria;

@Controller
public class MainController {

   @Autowired
   AdvertiseService advertiseService;

   @Autowired
   IngredientService ingredientService;
   
   @Autowired
   RecipeService recipeService;
   
   @RequestMapping("/")
   public String mainPage(Model model, @ModelAttribute("scri") SearchCriteria scri) throws Exception {
	  PageMaker pageMaker = new PageMaker();
	   
      List<IngredientVO> sellIngList = null;
      sellIngList = ingredientService.sellIngList(scri);
      Collections.shuffle(sellIngList);
      
      pageMaker.setCri(scri);
      pageMaker.setTotalCount(ingredientService.listCount(scri));
      model.addAttribute("sellIngList", sellIngList);
      
      List<AdvertiseVO> adList = null;
      adList = advertiseService.adList(scri);
      Collections.shuffle(adList);
      
      pageMaker.setCri(scri);
      pageMaker.setTotalCount(advertiseService.listCount(scri));
      model.addAttribute("adList", adList);
      
      List<RecipeVO> recipeList = null;
      recipeList = recipeService.sellRecipeList(scri);
      Collections.shuffle(recipeList);
      
      pageMaker.setCri(scri);
      pageMaker.setTotalCount(recipeService.listCount(scri));
      model.addAttribute("recipeList", recipeList);
      
      
      return "mainPage";
   }
}