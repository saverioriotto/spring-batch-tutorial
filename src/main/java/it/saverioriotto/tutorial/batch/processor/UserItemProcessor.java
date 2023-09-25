package it.saverioriotto.tutorial.batch.processor;

import it.saverioriotto.tutorial.batch.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {
    private static final Logger LOG = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(final User user) throws Exception {
        final String firstName = user.getFirstName().toUpperCase();
        final String lastName = user.getLastName().toUpperCase();

        final User userUpperCase = new User(firstName, lastName);

        LOG.info("User to UpperCase : "+userUpperCase.getFirstName()+ " "+userUpperCase.getLastName());

        return userUpperCase;
    }

}