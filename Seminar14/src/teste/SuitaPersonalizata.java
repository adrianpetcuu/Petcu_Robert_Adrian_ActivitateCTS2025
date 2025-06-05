package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AplicaDiscounTest.class, GetVarstaTest.class})
@Categories.IncludeCategory(CategorieRightBicep.class)
@Categories.ExcludeCategory(CategorieCorrect.class)

public class SuitaPersonalizata {
}
