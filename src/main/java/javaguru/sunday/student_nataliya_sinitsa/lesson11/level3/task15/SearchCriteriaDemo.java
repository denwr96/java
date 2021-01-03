package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        Book book = new Book("Kuper", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteriaOne = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        SearchCriteria searchCriteriaThree = new OrSearchCriteria(authorSearchCriteria,
                new OrSearchCriteria(titleSearchCriteria, yearOfIssueCriteria));

        System.out.println(searchCriteriaOne.match(book));
        System.out.println(searchCriteriaTwo.match(book));
        System.out.println(searchCriteriaThree.match(book));

    }

}

